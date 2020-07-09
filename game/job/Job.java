package game.job;

public abstract class Job {

    protected String jobName;
    protected String skill;

    public abstract void promote(int type);

    public abstract void hunting();

}
