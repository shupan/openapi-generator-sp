<?php

//Route::group(['middleware' => 'web', 'prefix' => 'department', 'namespace' => 'Modules\Department\Http\Controllers'], function()
//{
//    Route::get('/', 'DepartmentController@index');
//});

/** 路由的控制操作 : 采用默认的方式处理,默认模块和类名都是小写 */
Route::get(strtolower('/{module}/{class}/') . '{action}', function ($module, $class, $action) {
    $class = $this->app->make('Modules\\' . ucfirst($module) . '\\Http\\Controllers\\' . ucfirst($class) . 'Controller');
    return $class->$action(app("request"));
});

Route::post(strtolower('/{module}/{class}/') . '{action}', function ($module, $class, $action) {
    $class = $this->app->make('Modules\\' . ucfirst($module) . '\\Http\\Controllers\\' . ucfirst($class) . 'Controller');
    return $class->$action(app("request"));
});
