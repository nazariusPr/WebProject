package com.nazarois.WebProject.service.impl;

import com.nazarois.WebProject.model.Action;
import com.nazarois.WebProject.model.Image;
import com.nazarois.WebProject.repository.ImageRepository;
import com.nazarois.WebProject.service.ImageService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ImageServiceImpl implements ImageService {
  private final ImageRepository repository;

  @Override
  public Image create(String fileName, Action action) {
    Image image = buildImage(fileName, action);
    return repository.save(image);
  }

  @Override
  public List<Image> create(List<String> fileNames, Action action) {
    List<Image> images = fileNames.stream().map(fileName -> buildImage(fileName, action)).toList();
    return repository.saveAll(images);
  }

  @Override
  public void delete(Image image) {
    repository.delete(image);
  }

  @Override
  public void delete(List<Image> images) {
    images.forEach(this::delete);
  }

  private Image buildImage(String fileName, Action action) {
    return Image.builder().fileName(fileName).action(action).build();
  }
}
