package com.superpower.filebrowser;

public class FBMp3 extends FBFile implements FBPlayable {

    public FBMp3(String name) {
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
