<?php

namespace Modules\Department\Model;

use App\Model\BaseModel;

class DepartmentModel extends BaseModel
{
    public $table = 'department_info';

    public $connection = 'mysql';
}