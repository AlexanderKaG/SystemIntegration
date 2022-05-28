package com.superpower.filebrowser;

public class FPMp3 extends FBFile implements FBPlayable {

    public FPMp3(String name) {
        super(name);
    }

    public String thumbnail() {
        return "[mp3 ]";
    }

    @Override
    public void play() {
        System.out.println("Playing " + this);
    }
}
