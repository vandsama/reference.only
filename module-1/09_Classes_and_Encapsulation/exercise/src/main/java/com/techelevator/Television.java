package com.techelevator;

public class Television {
    boolean isOn = false;
    int currentChannel = 3;
    int currentVolume = 2;

    public boolean isOn() {
        return isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void turnOff() {
        isOn = false;
    }

    public void turnOn() {
        isOn = true;
    }

    public void changeChannel(int newChannel) {
        if (isOn == true){
            currentChannel = newChannel;
        }
    }

    public void channelUp() {
        if (isOn == true && currentChannel < 18){
            currentChannel += 1;
        } else if (isOn == true && currentChannel == 18) {
            currentChannel = 3;
        }
    }

    public void channelDown() {
        if (isOn == true) {
            if (currentChannel > 3){
                currentChannel -= 1;
            } else if (currentChannel == 3) {
            currentChannel = 18;
            }
        }
    }

    public void raiseVolume() {
        if (isOn == true) {
            currentVolume += 1;
        }
    }

    public void lowerVolume() {
        if (isOn == true && currentVolume >0) {
            currentVolume -= 1;
        }
    }

}
