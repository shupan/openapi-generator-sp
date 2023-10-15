<?php

namespace Modules\Department\Http\Controllers;

use App\Helpers\ArrayHelper;
use Illuminate\Http\Request;
use Illuminate\Routing\Controller;
use Modules\Department\Domain\DTO\DepartmentCreateRequest;
use Modules\Department\Exceptions\DepartmentException;
use Modules\Department\Services\DepartmentService;
use Symfony\Component\Serializer\Exception\ExceptionInterface;
use Symfony\Component\Serializer\Normalizer\ObjectNormalizer;

//use Symfony\Component\Serializer\Exception\ExceptionInterface;
//use Symfony\Component\Serializer\Normalizer\ObjectNormalizer;


class DepartmentController extends Controller
{

    /**
     * @api post /department/create 创建部门
     * <b>接口说明： 创建部门</b>
     */
    public function create(Request $request)
    {

        $validate = [

        ];
        $param = $request->all();
        $this->validateParam($param, $validate);
        // 请求的参数转换成请求的对象

        // @TODO  这里需要做一个转换，将请求的参数转换成请求的对象，暂时类ObjectNormalizer加载不了。
        $departmentCreateRequest = ArrayHelper::array2Object($param);
        $data = [];
        try {
            //$departmentCreateRequest = (new ObjectNormalizer())->denormalize($param, DepartmentCreateRequest::class);
            $data = DepartmentService::getInstance()->createDepartment($departmentCreateRequest);
        } catch (DepartmentException $e) {
            $this->_res([], $e->getCode(), $e->getMessage());
        } catch (ExceptionInterface $e) {
            $this->_res([], $e->getCode(), $e->getMessage());
        }
        $this->_res($data);
    }
}
