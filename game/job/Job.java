package game.job;

public abstract class Job {

    protected String jobName;
    protected String skill;

    // TODO : 추상 메소드
    public abstract void promote(int type);

    public abstract void hunting();

}
