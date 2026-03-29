package com.akhil.portfolio.model;

import java.util.List;

public record Profile(
        String name,
        String title,
        String location,
        String phone,
        String email,
        String linkedIn,
        String summary,
        List<String> skills,
        List<Experience> experiences,
        List<Education> education,
        List<String> certifications
) {
    public record Experience(String role, String company, String duration, List<String> highlights) {}
    public record Education(String degree, String institution, String year) {}
}
