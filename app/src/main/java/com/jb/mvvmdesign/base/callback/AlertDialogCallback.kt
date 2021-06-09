package com.jb.mvvmdesign.base.callback

interface AlertDialogCallback {

    fun onPositiveButton(dialogId: Int)

    fun onNegativeButton(dialogId: Int)
}