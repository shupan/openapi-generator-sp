<?php

namespace Modules\Ly\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Collection;
use App\Http\Controllers\Controller;
use Modules\Ly\Services\LyUserService;
use Modules\Ly\Model\LyUserModel;
use app\Exceptions\ErrorCode\CommonErrorCode;
use Log;

#tableComment("控制器")
class LyUserController extends Controller
{
     
    /**
     * @api post /ly/lyuser/create 创建用户表
     * <b>接口说明：用户表</b>
     * @throws \Exception
     */
    public function create(Request $request)
    {
        $validate = [

        ];
        $param = $request->all();
        $this->validateParam($param, $validate);
        $data = LyUserService::getInstance()->createLyUser($param);
        $this->_res(['id' => $data]);
    }

    /**
     * @api post /ly/lyuser/update 更新用户表
     * <b>接口说明：更新用户表</b>
     * @throws \Exception
     */
    public function update(Request $request)
    {
        $data = [];
        $validate = [
            'id' => 'required',
        ];
        $param = $request->all();
        $this->validateParam($param, $validate);

        $data = LyUserService::getInstance()->updateLyUser(
            $param,
            ['id' => $param['id']]
        );

        if (!empty($data)) {
            $this->_res();
        }
        $this->_res($data);
    }


    /**
     * @api post /ly/lyuser/delete 删除用户表
     * <b>接口说明：删除用户表 </b>
     * @throws \Exception
     */
    public function delete(Request $request)
    {
        $data = [];
        $validate = [
            'id' => 'required',
        ];
        $param = $request->all();
        $data = LyUserModel::getInstance()->deleteByFilter(
            ['id' => $param['id']]
        );
        $this->_res($data);
    }
    
    /**
     * @api get /ly/lyuser/list 创建用户表
     * <b>接口说明：用户表</b>
     * @throws \Exception
     */
    public function list(Request $request)
    {
        $validate = [

        ];
        $param = $request->all();
        $this->validateParam($param, $validate);
        $data = LyUserService::getInstance()->getLyUserList($param);
        $this->_res($data);
    }

}
