package com.scorecard.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Score {

    private Integer runs;
    private Integer  batsmanId;
    private Integer bowlerId;
    private Integer fielderId;
    private ExtraType extra;
    private Wicket wicket;

    public Score() {
    }


    public Integer getRuns() {
        return runs;
    }

    public void setRuns(Integer runs) {
        this.runs = runs;
    }

    public Integer getBatsmanId() {
        return batsmanId;
    }

    public void setBatsmanId(Integer batsmanId) {
        this.batsmanId = batsmanId;
    }

    public Integer getBowlerId() {
        return bowlerId;
    }

    public void setBowlerId(Integer bowlerId) {
        this.bowlerId = bowlerId;
    }

    public Integer getFielderId() {
        return fielderId;
    }

    public void setFielderId(Integer fielderId) {
        this.fielderId = fielderId;
    }

    public ExtraType getExtra() {
        return extra;
    }

    public void setExtra(ExtraType extra) {
        this.extra = extra;
    }

    public Wicket getWicket() {
        return wicket;
    }

    public void setWicket(Wicket wicket) {
        this.wicket = wicket;
    }
}
