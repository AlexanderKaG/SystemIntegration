package com.superpower.filebrowser;

public class FBOgg extends FBFile implements FBPlayable {
    public FBOgg(String name) {
        super(name);
    }

    public String thumbnail() {
        return "[ogg ]";
    }

    @Override
    public void play() {
        System.out.println("Playing " + this);
    }
}
