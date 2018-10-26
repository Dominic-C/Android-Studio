package piano;

import java.util.ArrayList;

import javax.sound.midi.MidiUnavailableException;

import midi.Instrument;
import midi.Midi;
import music.NoteEvent;
import music.Pitch;

public class PianoMachine {

	private Midi midi;
    private static int semitone = 0;
    private ArrayList<Pitch> pitchQueue = new ArrayList<>();
    private Instrument instrument = Midi.DEFAULT_INSTRUMENT;
    private ArrayList<NoteEvent> recordedNotes = new ArrayList<>();
    private static boolean isRecording = false;

    /**
	 * constructor for PianoMachine.
	 *
	 * initialize midi device and any other state that we're storing.
	 */

    public PianoMachine() {
    	try {
            midi = Midi.getInstance();
        } catch (MidiUnavailableException e1) {
            System.err.println("Could not initialize midi device");
            e1.printStackTrace();
            return;
        }
    }

    //TODO write method spec
    public void beginNote(Pitch rawPitch) {
    	//TODO implement for question 1
        // if semitones are not 0, pitch changes. i.e. we have to to output
        if(semitone != 0)
        {
            rawPitch = rawPitch.transpose(semitone); // Pitch.transpose returns a new pitch
        }
        if(pitchQueue.contains(rawPitch) == false)
        {
            pitchQueue.add(rawPitch);
            midi.beginNote(rawPitch.toMidiFrequency(), instrument);
            if(isRecording)
                recordedNotes.add(new NoteEvent(rawPitch, System.currentTimeMillis(), instrument, NoteEvent.Kind.start));
        }
    }

    //TODO write method spec
    public void endNote(Pitch rawPitch) {
    	//TODO implement for question 1
        if(semitone != 0)
        {
            rawPitch = rawPitch.transpose(semitone);
        }
        if(pitchQueue.contains(rawPitch) == true)
        {
            pitchQueue.remove(rawPitch);
            midi.endNote(rawPitch.toMidiFrequency(), instrument);
            if(isRecording)
                recordedNotes.add(new NoteEvent(rawPitch, System.currentTimeMillis(), instrument, NoteEvent.Kind.stop));

        }
    }

    //TODO write method spec
    public void changeInstrument() {
       	//TODO: implement for question 2
        instrument = instrument.next();
    }

    //TODO write method spec
    public void shiftUp() {
    	//TODO: implement for question 3
        if (semitone < 24) // if semitone is less than 24, i can still increase it by one octave
        {
            semitone += Pitch.OCTAVE;
        }
    }

    //TODO write method spec
    public void shiftDown() {
    	//TODO: implement for question 3
        if (semitone > -24) // if semitone is more than -24, i can still reduce it by one octave
        {
            semitone -= Pitch.OCTAVE;
        }
    }

    //TODO write method spec
    public boolean toggleRecording() {
    	//TODO: implement for question 4
        isRecording = !isRecording;
        if(isRecording == true)
        {
            recordedNotes = new ArrayList<NoteEvent>();
        }
        return isRecording;

    }

    //TODO write method spec
    public void playback() {
        //TODO: implement for question 4
         long initial_delay = 0;

        for (NoteEvent note : recordedNotes)
        {
            Midi.rest(Math.round((note.getTime()-initial_delay)/10)); // delay converted to 100th of a second for midi.rest
            initial_delay = note.getTime();
            instrument = note.getInstr();
            if(note.getKind() == NoteEvent.Kind.start)
            {
//                midi.beginNote(note.getPitch().toMidiFrequency(),instrument);
                beginNote(note.getPitch());
            }
            if(note.getKind() == NoteEvent.Kind.stop)
            {
//                midi.endNote(note.getPitch().toMidiFrequency(),instrument);
                endNote(note.getPitch());
            }
        }
        // System.out.println(midi.history());
    }

}
