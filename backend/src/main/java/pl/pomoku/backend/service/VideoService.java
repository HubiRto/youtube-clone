package pl.pomoku.backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import pl.pomoku.backend.controller.VideoDto;
import pl.pomoku.backend.model.Video;
import pl.pomoku.backend.repository.VideoRepository;

@Service
@RequiredArgsConstructor
public class VideoService {
    private final S3Service s3Service;
    private final VideoRepository videoRepository;
    public void uploadVideo(MultipartFile file){
        String videoUrl = s3Service.uploadFile(file);
        var video = new Video();
        video.setVideoUrl(videoUrl);
        videoRepository.save(video);
    }

    public VideoDto editVideo(VideoDto videoDto) {
        Video savedVideo = videoRepository.findById(videoDto.id())
                .orElseThrow(() -> new IllegalArgumentException("Nie można znależć filmu o id - " + videoDto.id()));
        savedVideo.setTitle(videoDto.title());
        savedVideo.setDescription(videoDto.description());
        savedVideo.setTags(videoDto.tags());
        savedVideo.setThumbnailUrl(videoDto.thumbnailUrl());
        savedVideo.setVideoStatus(videoDto.videoStatus());

        videoRepository.save(savedVideo);
        return videoDto;
    }
}
