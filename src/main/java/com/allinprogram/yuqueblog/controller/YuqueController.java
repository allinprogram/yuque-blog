package com.allinprogram.yuqueblog.controller;

import com.allinprogram.yuqueblog.common.YuqueRespParseUtil;
import com.allinprogram.yuqueblog.infrastructure.client.YuqueApiClient;
import com.allinprogram.yuqueblog.infrastructure.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 语雀API Controller
 *
 * @author AllinProgram
 * @since 2022-03-08 13:39 星期二
 */
@Validated
@RestController
@RequestMapping("api")
public class YuqueController {

    @Autowired
    private YuqueApiClient yuqueApiClient;

    @GetMapping("user")
    public UserDTO getUser() {
        return YuqueRespParseUtil.parse(yuqueApiClient.getUser(), UserDTO.class);
    }

    @GetMapping("repos")
    public List<RepoDTO> getRepos(Integer userId) {
        return YuqueRespParseUtil.parseList(yuqueApiClient.getRepos(userId), RepoDTO.class);

    }

    @GetMapping("repo")
    public RepoDetailDTO getRepo(Integer repoId) {
        return YuqueRespParseUtil.parse(yuqueApiClient.getRepo(repoId), RepoDetailDTO.class);
    }

    @GetMapping("docs")
    public List<DocDTO> getDocs(Integer repoId) {
        return YuqueRespParseUtil.parseList(yuqueApiClient.getDocs(repoId), DocDTO.class);

    }

    @GetMapping("doc")
    public DocDetailDTO getDoc(String namespace, String slug) {
        return YuqueRespParseUtil.parse(yuqueApiClient.getDoc(namespace, slug), DocDetailDTO.class);
    }
}