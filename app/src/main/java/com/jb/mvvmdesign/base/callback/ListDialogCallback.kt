package com.jb.shopfeur.base.callback

interface ListDialogCallback {
    fun onItemSelected(which: Int?, selectedData: String?, dialogId: Int?)
    fun onDismiss(dialogId: Int?)
}