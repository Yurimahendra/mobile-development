<?php

namespace App\Http\Controllers;

use App\User;
use Illuminate\Foundation\Auth\Access\AuthorizesRequests;
use Illuminate\Foundation\Bus\DispatchesJobs;
use Illuminate\Foundation\Validation\ValidatesRequests;
use Illuminate\Http\Request;
use Illuminate\Routing\Controller as BaseController;

class Controller extends BaseController
{
    use AuthorizesRequests, DispatchesJobs, ValidatesRequests;
    public function user(){
        return response()->json(User::get(), 200);
    }


    public function userid($id){
        return response()->json(User::find($id), 200);
    }

    public function save(Request $request){
        $user = User::create($request->all());
        return response()->json($user, 201);
    }
}
