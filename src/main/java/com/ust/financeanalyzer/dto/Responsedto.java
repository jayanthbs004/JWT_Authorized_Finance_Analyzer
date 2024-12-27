package com.ust.financeanalyzer.dto;

import java.util.List;


public class Responsedto {
    private  Projectdto projectdto;
    private List<Employeedto> empdto;

    public Projectdto getProjectdto() {
        return projectdto;
    }

    public void setProjectdto(Projectdto projectdto) {
        this.projectdto = projectdto;
    }

    public List<Employeedto> getEmpdto() {
        return empdto;
    }

    public void setEmpdto(List<Employeedto> empdto) {
        this.empdto = empdto;
    }

    public Responsedto(Projectdto projectdto, List<Employeedto> empdto) {
        this.projectdto = projectdto;
        this.empdto = empdto;
    }

    public Responsedto() {
    }
}
