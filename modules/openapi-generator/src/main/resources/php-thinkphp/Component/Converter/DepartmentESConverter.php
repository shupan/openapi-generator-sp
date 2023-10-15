<?php

namespace Modules\Department\Services;

use App\Helpers\UtilsHelper;
use App\Services\Converter\BaseConverter;
use Modules\Department\Domain\Fields\DepartmentFields;

class DepartmentESConverter extends BaseConverter
{

    /**
     * 转换请求的参数数据
     * @param $departmentCreateRequest
     * @return mixed
     */
    public function createDepartmentConverter($departmentCreateRequest)
    {


        $data = UtilsHelper::fillAssignment(DepartmentFields::getInstance()->getValues(), $departmentCreateRequest);
        return $data;
    }

    public function updateDepartmentConverter(array $departmentUpdateRequest)
    {
        $data = UtilsHelper::fillAssignment(DepartmentFields::getInstance()->getValues(), $departmentUpdateRequest);
        return $data;
    }
}