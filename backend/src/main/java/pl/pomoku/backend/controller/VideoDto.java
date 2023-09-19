package pl.pomoku.backend.controller;

import pl.pomoku.backend.model.VideoStatus;

import java.util.Set;

public record VideoDto(String id, String title, String description, Set<String> tags, String videoUrl,
                       VideoStatus videoStatus, String thumbnailUrl) {
}
