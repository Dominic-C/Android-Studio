package piano;

import javax.sound.midi.MidiUnavailableException;

import midi.Instrument;
import midi.Midi;
import music.Pitch;

public class PianoMachine {
	
	private Midi midi;
	private static int semitone = 0;
    
	/**
	 * constructor for PianoMachine.
	 * 
	 * initialize midi device and any other state that we're storing.
	 */
	private Instrument instrument = Midi.DEFAULT_INSTRUMENT;
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
        midi.beginNote(rawPitch.toMidiFrequency());


    }
    
    //TODO write method spec
    public void endNote(Pitch rawPitch) {
    	//TODO implement for question 1
        if(semitone != 0)
        {
            rawPitch = rawPitch.transpose(semitone);
        }
        midi.endNote(rawPitch.toMidiFrequency());

    }
    
    //TODO write method spec
    public void changeInstrument() {
       	//TODO: implement for question 2
        instrument = instrument.next();
    }
    
    //TODO write method spec
    public void shiftUp() {
    	//TODO: implement for question 3
        if (semitone <= 24) // if semitone is less than 24, i can still increase it by one octave
        {
            semitone += Pitch.OCTAVE;
        }

    }
    
    //TODO write method spec
    public void shiftDown() {
    	//TODO: implement for question 3
        if (semitone >= -24) // if semitone is more than -24, i can still reduce it by one octave
        {
            semitone -= Pitch.OCTAVE;
        }
    }
    
    //TODO write method spec
    public boolean toggleRecording() {
    	return false;
    	//TODO: implement for question 4
    }
    
    //TODO write method spec
    public void playback() {    	
        //TODO: implement for question 4
    }

}
