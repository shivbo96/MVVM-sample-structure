package com.jb.shopfeur.base.callback

interface AlertDialogCallback {

    fun onPositiveButton(dialogId: Int)

    fun onNegativeButton(dialogId: Int)
}