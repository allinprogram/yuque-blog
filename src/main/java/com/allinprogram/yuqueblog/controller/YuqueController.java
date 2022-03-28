package com.allinprogram.yuqueblog.controller;

import com.allinprogram.yuqueblog.common.YuqueRespParseUtil;
import com.allinprogram.yuqueblog.infrastructure.client.RepoClient;
import com.allinprogram.yuqueblog.infrastructure.client.UserClient;
import com.allinprogram.yuqueblog.infrastructure.dto.DocDTO;
import com.allinprogram.yuqueblog.infrastructure.dto.RepoDTO;
import com.allinprogram.yuqueblog.infrastructure.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wildfly.common.annotation.NotNull;

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
    private UserClient userClient;

    @Autowired
    private RepoClient repoClient;

    @GetMapping("user")
    public UserDTO getUser() {
        return YuqueRespParseUtil.parse(userClient.getUser(), UserDTO.class);
    }

    @GetMapping("repos")
    public List<RepoDTO> getRepos(@NotNull Integer userId) {
        return YuqueRespParseUtil.parseList(userClient.getRepos(userId), RepoDTO.class);

    }

    @GetMapping("repo")
    public RepoDTO getRepo(Integer repoId) {
        return YuqueRespParseUtil.parse(repoClient.getRepo(repoId), RepoDTO.class);
    }

    @GetMapping("docs")
    public List<DocDTO> getDocs(Integer repoId) {
        return YuqueRespParseUtil.parseList(repoClient.getDocs(repoId), DocDTO.class);

    }

    @GetMapping("doc")
    public DocDTO getDoc(String namespace, String slug) {
        return YuqueRespParseUtil.parse( repoClient.getDoc(namespace, slug), DocDTO.class);
    }
}