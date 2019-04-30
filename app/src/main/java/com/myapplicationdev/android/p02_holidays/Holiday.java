package com.myapplicationdev.android.p02_holidays;

public class Holiday {
    private String name;
    private boolean pic;
    public Holiday(String name, boolean pic) {
        this.name = name;
        this.pic = pic;
    }
    public String getName() {
        return name;
    }
    public boolean isPic() {


        return pic;
    }
}
