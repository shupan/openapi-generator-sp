<?php

namespace Tests\Modules\Department\Services;

use App\Helpers\ArrayHelper;
use Modules\Department\Domain\DTO\DepartmentGetRequest;
use Modules\Department\Model\DepartmentModel;
use Modules\Department\Services\DepartmentService;
use PHPUnit\Framework\TestCase;

class DepartmentModelTest extends TestCase
{
    function testHello()
    {
        self::assertTrue(true);
    }

    function testDepartment()
    {
        DepartmentModel::getInstance()->findRow([], ['id' => 1]);
    }


}
