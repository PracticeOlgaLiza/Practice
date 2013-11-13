package model;
import javax.sound.sampled.AudioFileFormat;

public class SoundModel extends AbstractModel{
    private short shortAmplitude[];
    private boolean booleanPauses[];
    private int from;
    private int to;
    private AudioFileFormat audioFileFormat;
    private String nameOfFile;

    public SoundModel(short[] audio){
        setShortAmplitude(audio);
    }

    public void setAudioFileFormat(AudioFileFormat value) {
        audioFileFormat = value;
    }

    public AudioFileFormat getAudioFileFormat() {
        return audioFileFormat;
    }

    public void setNameOfFile(String value) {
        nameOfFile = value;
    }

    public String getNameOfFile() {
        return nameOfFile;
    }

    public short[] getShortAmplitude(){
        return shortAmplitude;
    }

    public void setShortAmplitude(short arr[]){
        shortAmplitude = arr;
    }

    public int getFrom(){
        return from;
    }

    public void setFrom(int value){
        from = value;
    }

    public int getTo(){
        return to;
    }

    public void setTo(int value){
        to = value;
    }

    public boolean[] getBooleanPauses(){
        return booleanPauses;
    }

    public void setBooleanPauses(boolean arr[]){
        booleanPauses = arr;
    }
}