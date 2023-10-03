<?php

namespace Modules\Ly\Exceptions;

class LyException extends \Exception
{
    /** 模块功能的错误码 */
    const ERROR_CODE = -1;

    public function __construct($message, $code = self::ERROR_CODE)
    {
        parent::__construct($message, $code);
    }

    public function __toString()
    {
        return __CLASS__ . ": [{$this->code}]: {$this->message}\n";
    }
}
