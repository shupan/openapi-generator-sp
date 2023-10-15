<?php

namespace Modules\Department\Component\Validator;

use App\Services\Validator\BaseValidator;
use Modules\Department\Domain\DTO\DepartmentCreateRequest;
use Modules\Department\Domain\DTO\DepartmentCreateResponse;
use Modules\Department\Exceptions\DepartmentException;

class DepartmentESValidator extends BaseValidator
{

    /**
     * 验证器
     * 描述：
     * 1. 必要字段的的验证条件, 对于必要字段，如果没有传递，那么就会抛出异常
     * @param DepartmentCreateRequest $departmentCreateRequest
     * @return DepartmentCreateResponse
     * @throws DepartmentException
     */
    public function createDepartmentValidator($departmentCreateRequest)
    {

        $validate = [
            'name' => 'required',
            'parentid' => 'required',
            'order' => 'required',
            'createDeptGroup' => 'required',
        ];
        $this->validateParam($departmentCreateRequest, $validate);

        // 检查名称是否重复
        $department = DepartementModel::where('name', $departmentCreateRequest->name)->first();
        if (!empty($department)) {
            throw new DepartmentException("名称重复");
        }

        // 检查父部门 ID 是否存在
        $department = DepartementModel::where('id', $departmentCreateRequest->parentid)->first();
        if (!empty($department)) {
            throw new DepartmentException("父部门 ID 不存在");
        }

//        // 部门状态验证：部门状态应该是有效的状态，例如正常、停用等。
//        $department = DepartementModel::where('status', $departmentCreateRequest->status)->first();
//        if ($department->status != 1) {
//            throw new DepartmentException("部门状态应该是有效的状态，例如正常、停用等");
//        }

        // autoApproveApply 验证
        $this->validateParam($request, ['autoApproveApply' => 'boolean']);

// createDeptGroup 验证
        $this->validateParam($request, ['createDeptGroup' => 'boolean']);

// deptPermits 验证
        $this->validateParam($request, ['deptPermits' => 'string', 'max:200']);

// hideDept 验证
        $this->validateParam($request, ['hideDept' => 'boolean']);

// name 验证
        $this->validateParam($request, ['name' => 'string', 'min:1', 'max:64', 'not_contains' => '-', 'not_contains' => ',', 'not_contains' => ',']);

// order 验证
        $this->validateParam($request, ['order' => 'numeric']);

// outerDept 验证
        $this->validateParam($request, ['outerDept' => 'boolean']);

// outerDeptOnlySelf 验证
        $this->validateParam($request, ['outerDeptOnlySelf' => 'boolean']);

// outerPermitDepts 验证
        $this->validateParam($request, ['outerPermitDepts' => 'string', 'max:200']);

// outerPermitUsers 验证
        $this->validateParam($request, ['outerPermitUsers' => 'string', 'max:200']);

// parentid 验证
        $this->validateParam($request, ['parentid' => 'numeric']);

// sourceIdentifier 验证
        $this->validateParam($request, ['sourceIdentifier' => 'string']);

// userPermits 验证
        $this->validateParam($request, ['userPermits' => 'string', 'max:200']);


    }

    public function updateDepartmentValidator(array $departmentUpdateRequest)
    {
        $validate = [

        ];
        $this->validateParam($departmentUpdateRequest, $validate);
    }
}