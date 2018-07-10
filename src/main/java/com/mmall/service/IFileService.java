package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: Zhihao Chen
 * @Date: Created in 16:00 2018/6/30
 * @Description
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
