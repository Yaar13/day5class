package com.lambton;

public class Mobile extends computer
{
    private String operatingsystemname;
    private boolean canmakecall'

    public String getOperatingsystemname() {
        return operatingsystemname;
    }

    public void setOperatingsystemname(String operatingsystemname) {
        this.operatingsystemname = operatingsystemname;
    }

    public boolean isCanmakecall() {
        return canmakecall;
    }

    public void setCanmakecall(boolean canmakecall) {
        this.canmakecall = canmakecall;
    }

    public String getProvidername() {
        return providername;
    }

    public void setProvidername(String providername) {
        this.providername = providername;
    }

    private String providername;//rogers, bell, fido

}
