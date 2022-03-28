package com.allinprogram.yuqueblog.common;

/**
 * @author AllinProgram
 * @since 2022-03-14 23:28 星期一
 */
public class FieldParseUtil {

    static String[] fields = {"id - 文档编号",
            "slug - 文档路径",
            "title - 标题",
            "book_id - 仓库编号，就是 repo_id",
            "book - 仓库信息 <BookSerializer>，就是 repo 信息",
            "user_id - 用户/团队编号",
            "user - 用户/团队信息 <UserSerializer>",
            "format - 描述了正文的格式 [lake , markdown]",
            "body - 正文 Markdown 源代码",
            "body_draft - 草稿 Markdown 源代码",
            "body_html - 转换过后的正文 HTML （重大变更，详情请参考：https://www.yuque.com/yuque/developer/yr938f）",
            "body_lake - 语雀 lake 格式的文档内容",
            "creator_id - 文档创建人 User Id",
            "public - 公开级别 [0 - 私密, 1 - 公开]",
            "status - 状态 [0 - 草稿, 1 - 发布]",
            "likes_count - 赞数量",
            "comments_count - 评论数量",
            "content_updated_at - 文档内容更新时间",
            "deleted_at - 删除时间，未删除为 null",
            "created_at - 创建时间",
            "updated_at - 更新时间",};

    public static void main(String[] args) {
        for (String field : fields) {
            System.out.println("/**\n" +
                    " * " + field.substring(field.indexOf("-") + 1) + "\n */");
            System.out.println("private String " + field.substring(0, field.indexOf("-")) + ";");
        }
    }
}
