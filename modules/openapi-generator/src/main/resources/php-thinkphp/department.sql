CREATE TABLE IF NOT EXISTS `department_info`
(
    `id`
                           INTEGER
                                            NOT
                                                NULL
        auto_increment,
    `name`
                           VARCHAR(255)     NOT NULL COMMENT '部门名称。长度限制为1~64个字符，不允许包含字符\"-\"\",\"以及\",\"。',
    `parent_id`            DOUBLE PRECISION NOT NULL COMMENT '父部门ID，根部门ID为1。',
    `hide_dept`            JSON             NOT NULL COMMENT '是否隐藏本部门：true：隐藏部门，隐藏后本部门将不会显示在公司通讯录中false（默认值）：显示部门',
    `dept_permits`         VARCHAR(255)     NOT NULL COMMENT '指定可以查看本部门的其他部门列表，总数不能超过200。当hide_dept为true时，则此值生效。',
    `user_permits`         VARCHAR(255)     NOT NULL COMMENT '指定可以查看本部门的人员userid列表，总数不能超过200。当hide_dept为true时，则此值生效。',
    `outer_dept`           JSON             NOT NULL COMMENT '是否限制本部门成员查看通讯录：true：开启限制。开启后本部门成员只能看到限定范围内的通讯录false（默认值）：不限制',
    `outer_dept_only_self` JSON             NOT NULL COMMENT '本部门成员是否只能看到所在部门及下级部门通讯录：true：只能看到所在部门及下级部门通讯录false：不能查看所有通讯录，在通讯录中仅能看到自己当outer_dept为true时，此参数生效。',
    `outer_permit_users`   VARCHAR(255)     NOT NULL COMMENT '指定本部门成员可查看的通讯录用户userid列表，总数不能超过200。当outer_dept为true时，此参数生效。',
    `outer_permit_depts`   VARCHAR(255)     NOT NULL COMMENT '指定本部门成员可查看的通讯录部门ID列表，总数不能超过200。当outer_dept为true时，此参数生效。',
    `create_dept_group`    JSON             NOT NULL COMMENT '是否创建一个关联此部门的企业群，默认为false即不创建。',
    `auto_approve_apply`   JSON             NOT NULL COMMENT '是否默认同意加入该部门的申请：true：表示加入该部门的申请将默认同意false：表示加入该部门的申请需要有权限的管理员同意',
    `order`                DOUBLE PRECISION NOT NULL COMMENT '在父部门中的排序值，order值小的排序靠前。',
    `source_identifier`    VARCHAR(255)     NOT NULL COMMENT '部门标识字段，开发者可用该字段来唯一标识一个部门，并与钉钉外部通讯录里的部门做映射。',
    `createdAt`            DATETIME         NOT NULL,
    `updatedAt`            DATETIME         NOT NULL,
    PRIMARY KEY
        (
         `id`
            )
) ENGINE = InnoDB COMMENT '部门表';