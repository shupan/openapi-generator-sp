<?php

namespace Tests\Modules\Department\Services;

use App\Helpers\ArrayHelper;
use Modules\Department\Domain\DTO\DepartmentGetRequest;
use Modules\Department\Services\DepartmentService;
use PHPUnit\Framework\TestCase;

class DepartmentServiceTest extends TestCase
{
    function testHello()
    {
        self::assertTrue(true);
    }


    /**
     * 获取部门的服务
     * @return void
     * @throws \Modules\Department\Exceptions\DepartmentException
     */
    function testGetDepartmentService()
    {
        $departmentGetRequest = new DepartmentGetRequest();
        $departmentGetRequest->id = "1";
        $departmentGetRequest->name = "name";
        $data = DepartmentService::getInstance()->getDepartment($departmentGetRequest);
        self::assertTrue($this->count($data) > 0);
    }



    function testObjectMerge()
    {

        // 创建两个对象
        $user = new User();
        $address = new Address();

// 将地址对象转换为数组
        $address_array = (array)$address;

// 使用 array_merge() 函数将地址对象的属性合并到用户对象中
        $user = array_merge($user, $address_array);

// 输出用户对象的属性
        echo $user->name . PHP_EOL;
        echo $user->age . PHP_EOL;
        echo $user->street . PHP_EOL;
        echo $user->city . PHP_EOL;
        echo $user->state . PHP_EOL;


// 输出：
// John Doe
// 30
// 123 Main Street
// Anytown
// CA
    }


}

// 定义两个类
class User
{
    public $name = "John Doe";
    public $age = 30;
}

class Address
{
    public $street = "123 Main Street";
    public $city = "Anytown";
    public $state = "CA";
}
