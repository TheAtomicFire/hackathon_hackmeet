package com.example.hackathon_hackmeet.model;

import java.util.List;

public class HackerInfo {
    private String hackerId;
    private String fullName;
    private String email;
    private List<String> techStack;
    private List<String> progLang;
    private int hackExp;
    private String role;

    public void setHackerId(final String hackerId) {
        this.hackerId = hackerId;
    }

    public void setFullName(final String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setTechStack(final List<String> techStack) {
        this.techStack = techStack;
    }

    public void setProgLang(final List<String> progLang) {
        this.progLang = progLang;
    }

    public void setHackExp(final int hackExp) {
        this.hackExp = hackExp;
    }

    public void setRole(final String role) {
        this.role = role;
    }

    public String getHackerId() {
        return this.hackerId;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getEmail() {
        return this.email;
    }

    public List<String> getTechStack() {
        return this.techStack;
    }

    public List<String> getProgLang() {
        return this.progLang;
    }

    public int getHackExp() {
        return this.hackExp;
    }

    public String getRole() {
        return this.role;
    }




}
