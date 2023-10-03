<?php

namespace Modules\Ly\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Collection;
use App\Http\Controllers\Controller;
use Modules\Ly\Services\LyCrontabLogService;
use Modules\Ly\Model\LyCrontabLogModel;
use app\Exceptions\ErrorCode\CommonErrorCode;
use Log;

#tableComment("控制器")
class LyCrontabLogController extends Controller
{
     
    /**
     * @api post /ly/lycrontablog/create 创建
     * <b>接口说明：</b>
     * @throws \Exception
     */
    public function create(Request $request)
    {
        $validate = [

        ];
        $param = $request->all();
        $this->validateParam($param, $validate);
        $data = LyCrontabLogService::getInstance()->createLyCrontabLog($param);
        $this->_res(['id' => $data]);
    }

    /**
     * @api post /ly/lycrontablog/update 更新
     * <b>接口说明：更新</b>
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

        $data = LyCrontabLogService::getInstance()->updateLyCrontabLog(
            $param,
            ['id' => $param['id']]
        );

        if (!empty($data)) {
            $this->_res();
        }
        $this->_res($data);
    }


    /**
     * @api post /ly/lycrontablog/delete 删除
     * <b>接口说明：删除 </b>
     * @throws \Exception
     */
    public function delete(Request $request)
    {
        $data = [];
        $validate = [
            'id' => 'required',
        ];
        $param = $request->all();
        $data = LyCrontabLogModel::getInstance()->deleteByFilter(
            ['id' => $param['id']]
        );
        $this->_res($data);
    }
    
    /**
     * @api get /ly/lycrontablog/list 创建
     * <b>接口说明：</b>
     * @throws \Exception
     */
    public function list(Request $request)
    {
        $validate = [

        ];
        $param = $request->all();
        $this->validateParam($param, $validate);
        $data = LyCrontabLogService::getInstance()->getLyCrontabLogList($param);
        $this->_res($data);
    }

}
