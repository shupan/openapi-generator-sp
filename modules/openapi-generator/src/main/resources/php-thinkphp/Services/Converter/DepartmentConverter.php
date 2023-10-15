<?php

namespace Modules\Department\Services\Converter;

use App\Helpers\ArrayHelper;
use App\Helpers\UtilsHelper;
use App\Services\BaseService;
use Modules\Department\Domain\Fields\DepartmentInfoFields;

class DepartmentConverter extends BaseService
{

    /**
     * 转换请求的参数数据
     * @param $departmentCreateRequest
     * @return mixed
     */
    public function createDepartmentConverter($departmentCreateRequest)
    {
        $arr = ArrayHelper::object2Array($departmentCreateRequest);
        $data = UtilsHelper::fillAssignment(DepartmentInfoFields::getInstance()->getValues(), $arr);
        return $data;
    }

    public function updateDepartmentConverter(array $departmentUpdateRequest)
    {
        $data = UtilsHelper::fillAssignment(DepartmentFields::getInstance()->getValues(), $departmentUpdateRequest);
        return $data;
    }

    /**
     * 对于返回的结果的数据转换
     * @return object
     */
    public function getDepartmentConverter(array $departmentGetResult)
    {
        $departmentGetResponse = new DepartmentGetResponse();
        $departmentGetResponseArr = ArrayHelper::object2Array($departmentGetResponse);
        $departmentGetResponseArr = array_merge($departmentGetResponseArr, $departmentGetResult);
        return ArrayHelper::array2Object($departmentGetResponseArr);
    }

}