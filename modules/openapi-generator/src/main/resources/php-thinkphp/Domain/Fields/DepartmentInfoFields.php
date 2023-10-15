<?php

namespace Modules\Department\Domain\Fields;

use App\Enum\AbstractEnum;

#tableComment("实体")
class DepartmentInfoFields extends AbstractEnum
{

    const ID = 'id';

    /** 部门名称。长度限制为1~64个字符，不允许包含字符"-"","以及","。 */
    const NAME = 'name';

    /** 父部门ID，根部门ID为1。 */
    const PARENT_ID = 'parent_id';

    /** 是否隐藏本部门：true：隐藏部门，隐藏后本部门将不会显示在公司通讯录中false（默认值）：显示部门 */
    const HIDE_DEPT = 'hide_dept';

    /** 指定可以查看本部门的其他部门列表，总数不能超过200。当hide_dept为true时，则此值生效。 */
    const DEPT_PERMITS = 'dept_permits';

    /** 指定可以查看本部门的人员userid列表，总数不能超过200。当hide_dept为true时，则此值生效。 */
    const USER_PERMITS = 'user_permits';

    /** 是否限制本部门成员查看通讯录：true：开启限制。开启后本部门成员只能看到限定范围内的通讯录false（默认值）：不限制 */
    const OUTER_DEPT = 'outer_dept';

    /** 本部门成员是否只能看到所在部门及下级部门通讯录：true：只能看到所在部门及下级部门通讯录false：不能查看所有通讯录，在通讯录中仅能看到自己当outer_dept为true时，此参数生效。 */
    const OUTER_DEPT_ONLY_SELF = 'outer_dept_only_self';

    /** 指定本部门成员可查看的通讯录用户userid列表，总数不能超过200。当outer_dept为true时，此参数生效。 */
    const OUTER_PERMIT_USERS = 'outer_permit_users';

    /** 指定本部门成员可查看的通讯录部门ID列表，总数不能超过200。当outer_dept为true时，此参数生效。 */
    const OUTER_PERMIT_DEPTS = 'outer_permit_depts';

    /** 是否创建一个关联此部门的企业群，默认为false即不创建。 */
    const CREATE_DEPT_GROUP = 'create_dept_group';

    /** 是否默认同意加入该部门的申请：true：表示加入该部门的申请将默认同意false：表示加入该部门的申请需要有权限的管理员同意 */
    const AUTO_APPROVE_APPLY = 'auto_approve_apply';

    /** 在父部门中的排序值，order值小的排序靠前。 */
    const ORDER = 'order';

    /** 部门标识字段，开发者可用该字段来唯一标识一个部门，并与钉钉外部通讯录里的部门做映射。 */
    const SOURCE_IDENTIFIER = 'source_identifier';

    const CREATEDAT = 'createdat';

    const UPDATEDAT = 'updatedat';
}
