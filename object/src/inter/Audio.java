package inter;

public class Audio implements RemoteControl {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio 를 켭니다.");

    }

    @Override
    public void turnOFF() {
        System.out.println("Audio 를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) { // static은 클래스 이름. 으로 접근
            this.setVolume(RemoteControl.MAX_VOLUME);
        } else if (volume > RemoteControl.MIN_VOLUME) { // static은 클래스 이름. 으로 접근
            this.setVolume(RemoteControl.MIN_VOLUME);

        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨 : " + volume);

    }
}