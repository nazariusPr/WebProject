package com.nazarois.WebProject.service;

import com.nazarois.WebProject.model.Action;
import com.nazarois.WebProject.model.Image;
import java.util.List;

public interface ImageService {
  Image create(String fileName, Action action);

  List<Image> create(List<String> fileNames, Action action);
  void delete(Image image);
  void delete(List<Image> images);
}
