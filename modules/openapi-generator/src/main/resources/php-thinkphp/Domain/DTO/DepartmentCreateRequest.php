<?php

namespace Modules\Department\Domain\DTO;

class DepartmentCreateRequest
{

    /** @var string $userPermits 指定可以查看本部门的人员userid列表，总数不能超过200。当hide_dept为true时，则此值生效。 */
    public $userPermits;

    /** @var bool $outerDept 是否限制本部门成员查看通讯录：true：开启限制。开启后本部门成员只能看到限定范围内的通讯录false（默认值）：不限制 */
    public $outerDept;

    /** @var bool $outerDeptOnlySelf 本部门成员是否只能看到所在部门及下级部门通讯录：true：只能看到所在部门及下级部门通讯录false：不能查看所有通讯录，在通讯录中仅能看到自己当outer_dept为true时，此参数生效。 */
    public $outerDeptOnlySelf;

    /** @var string $outerPermitUsers 指定本部门成员可查看的通讯录用户userid列表，总数不能超过200。当outer_dept为true时，此参数生效。 */
    public $outerPermitUsers;

    /** @var string $outerPermitDepts 指定本部门成员可查看的通讯录部门ID列表，总数不能超过200。当outer_dept为true时，此参数生效。 */
    public $outerPermitDepts;

    /** @var bool $createDeptGroup 是否创建一个关联此部门的企业群，默认为false即不创建。 */
    public $createDeptGroup;

    /** @var bool $autoApproveApply 是否默认同意加入该部门的申请：true：表示加入该部门的申请将默认同意false：表示加入该部门的申请需要有权限的管理员同意 */
    public $autoApproveApply;

    /** @var float $order 在父部门中的排序值，order值小的排序靠前。 */
    public $order;

    /** @var string $sourceIdentifier 部门标识字段，开发者可用该字段来唯一标识一个部门，并与钉钉外部通讯录里的部门做映射。 */
    public $sourceIdentifier;
    public $name;
}