package io.github.jeromejossant.ap4gsb.projection;

public interface DepartementView {

    Long getId();

    String getNom();

    String getNum();

    PaysView getPays();
}
