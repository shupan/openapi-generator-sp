<?php

namespace Modules\Department\Services;

use App\Services\BaseService;
use Modules\Department\Domain\DTO\DepartmentCreateResponse;
use Modules\Department\Domain\DTO\DepartmentGetRequest;
use Modules\Department\Domain\DTO\DepartmentUpdateResponse;
use Modules\Department\Domain\Fields\DepartmentInfoFields;
use Modules\Department\Exceptions\DepartmentException;
use Modules\Department\Model\DepartmentModel;
use Modules\Department\Services\Converter\DepartmentConverter;
use Modules\Department\Services\Validator\DepartmentValidator;

class DepartmentService extends BaseService
{

    /**
     * 请求的创建
     * @param DepartmentCreateRequest $departmentCreateRequest
     * @return DepartmentCreateResponse
     * @throws DepartmentException
     */
    public function createDepartment($departmentCreateRequest)
    {

        // 验证器
        DepartmentValidator::getInstance()->createDepartmentValidator($departmentCreateRequest);

        // 转换器
        $data = DepartmentConverter::getInstance()->createDepartmentConverter($departmentCreateRequest);
        DepartmentModel::getInstance()->insert($data);
        $departmentCreateResponse = new DepartmentCreateResponse();
        $departmentCreateResponse->deptId = "1";
        // 把转换的结果，然后调用model来实现
        return $departmentCreateResponse;
    }

    /**
     * 请求的更新
     * @param array $departmentUpdateRequest
     * @return DepartmentUpdateResponse
     * @throws \Exception
     */
    public function updateDepartment(array $departmentUpdateRequest)
    {
        // 验证器
        DepartmentValidator::getInstance()->updateDepartmentValidator($departmentUpdateRequest);

        // 转换器
        $data = DepartmentConverter::getInstance()->updateDepartmentConverter($departmentUpdateRequest);
        DepartmentModel::getInstance()->insert($data);
        $departmentUpdateResponse = new DepartmentUpdateResponse();
        $departmentUpdateResponse->setDeptId(1);
        // 把转换的结果，然后调用model来实现
        return $departmentUpdateResponse;
    }

    /**
     * 获取部门的信息
     * @param DepartmentGetRequest $departmentGetRequest
     * @return object
     * @throws DepartmentException
     */
    public function getDepartment(DepartmentGetRequest $departmentGetRequest)
    {
        DepartmentValidator::getInstance()->getDepartmentValidator($departmentGetRequest);
        $department = DepartmentModel::getInstance()->findRow(DepartmentInfoFields::getInstance()->getValues(),
            ['id' => $departmentGetRequest->id]);

        if (empty($department)) {
            return new DepartmentGetResponse();
        }

        // 对于转换结构的数据处理，并且返回操作
        $departmentResponse = DepartmentConverter::getInstance()->getDepartmentConverter($department);
        return $departmentResponse;
    }

    public function deleteDepartment(array $departmentUpdateRequest)
    {
        return [];
    }

//    function object_to_array($obj)
//    {
//        $obj = (array)$obj;
//        foreach ($obj as $k => $v) {
//            if (gettype($v) == 'resource') {
//                return;
//            }
//            if (gettype($v) == 'object' || gettype($v) == 'array') {
//                $obj[$k] = (array)$this->object_to_array($v);
//            }
//        }
//
//        return $obj;
//    }


}