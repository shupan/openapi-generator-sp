<?php

namespace Modules\Department\Domain\DTO;

use App\Enum\AbstractEnum;

class DepartmentGetRequest
{

    /**
     * @var string  id
     */
    public $id;

    /**
     * @var string  名称
     */
    public $name;
}