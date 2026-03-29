package com.akhil.portfolio.controller;

import com.akhil.portfolio.model.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String home(Model model) {
        Profile profile = new Profile(
                "Akhil Raveendran Pillai",
                "Software Engineer",
                "Malmö, Sweden",
                "+46 761 594 876",
                "akhildesigns07@gmail.com",
                "https://linkedin.com/in/akhildesigns07",
                "Software Engineer specializing in Java and Spring Boot with experience building cloud-native, " +
                        "event-driven microservices. Strong background in CI/CD automation, Agile delivery, code quality, " +
                        "and observability. Passionate about delivering scalable, reliable, and maintainable systems.",
                List.of(
                        "Java 8/11/21", "Spring Boot", "Microservices", "REST", "GraphQL", "JPA/Hibernate",
                        "AWS", "GitHub Actions", "Jenkins", "Docker", "Kubernetes", "JUnit", "Mockito",
                        "Testcontainers", "WireMock", "TDD", "Hexagonal Architecture", "Clean Architecture",
                        "Event-Driven Architecture", "Domain-Driven Design", "PostgreSQL", "MySQL", "MongoDB",
                        "MS-SQL", "Oracle", "Grafana", "Graylog", "OpenTelemetry", "ReactJS", "NodeJS"
                ),
                List.of(
                        new Profile.Experience(
                                "Senior Engineer",
                                "Qburst Technologies Pvt. Ltd",
                                "Nov 2022 – Dec 2024",
                                List.of(
                                        "Migrated large Spring applications to Spring Boot, improving maintainability and deployment reliability.",
                                        "Built and maintained CI/CD pipelines using GitHub Actions and Jenkins, accelerating delivery lifecycle.",
                                        "Developed Spring Boot microservices with JPA and REST APIs using clean and hexagonal architecture.",
                                        "Led code reviews, enforced TDD, and ensured consistent Gitflow practices.",
                                        "Improved application performance by 38% through caching optimization and query tuning."
                                )
                        ),
                        new Profile.Experience(
                                "Software Engineer",
                                "Gadgeon Smart Systems",
                                "Jun 2021 – Nov 2022",
                                List.of(
                                        "Developed and tested APIs with JUnit, Mockito, and Testcontainers in an Agile team.",
                                        "Participated in sprint planning, grooming, and retrospectives.",
                                        "Coordinated with frontend teams for seamless API integration and deployment readiness."
                                )
                        ),
                        new Profile.Experience(
                                "Junior Software Engineer",
                                "Benefitalign Technologies Pvt. Ltd",
                                "Jul 2018 – Jun 2021",
                                List.of(
                                        "Developed REST services using JAX-RS and Spring with MyBatis.",
                                        "Implemented EDE integrations during high-load Open Enrollment periods ensuring system stability."
                                )
                        )
                ),
                List.of(
                        new Profile.Education("Master in AI & Automation", "University West, Sweden", "2025"),
                        new Profile.Education("B.Tech in Computer Science and Engineering", "Amrita University", "2018")
                ),
                List.of(
                        "Learn Java Unit Testing with JUnit & Mockito — 2021",
                        "Robot Certificate (ABB) — 2025",
                        "Shining Star Award — 2020"
                )
        );

        model.addAttribute("profile", profile);
        model.addAttribute("experienceYears", "5+");
        model.addAttribute("rolesCount", "3");
        return "index";
    }
}
