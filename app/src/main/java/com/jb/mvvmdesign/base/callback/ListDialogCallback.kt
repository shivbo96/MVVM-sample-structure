package com.jb.mvvmdesign.base.callback

interface ListDialogCallback {
    fun onItemSelected(which: Int?, selectedData: String?, dialogId: Int?)
    fun onDismiss(dialogId: Int?)
}