//package com.olaover.inmortaltech.WebService;
//
//import android.app.ProgressDialog;
//import android.content.Context;
//
//
//
//public class MyDialog {
//
//    private Context context;
//    private static ProgressDialog progressDialog;
//    static MyDialog myDialog;
//
//    /* public MyDialog(Context context)
//     {//R.style.AppCompatAlertDialogStyle
//         progressDialog = new ProgressDialog(context, R.style.Theme_AppCompat_Dialog_Alert);
//         progressDialog.setMessage("Loading...");
//         progressDialog.setCanceledOnTouchOutside(false);
//     }*/
//    private MyDialog() {
//
//    }
//
//    public static MyDialog getInstance(Context context) {
//        if (progressDialog == null && myDialog == null) {
//            myDialog = new MyDialog();
//            progressDialog = new ProgressDialog(context);
//        }
//        return myDialog;
//    }
//
//    public void hideDialog() {
//    }
//}
//
////    public void showDialog() {
////        try {
////            if (progressDialog.isShowing()) {
////                progressDialog.dismiss();
////            }
////            progressDialog.setMessage("Loading...");
////            progressDialog.setCanceledOnTouchOutside(false);
////            progressDialog.show();
////        }catch (Exception e)
////        {
////            e.printStackTrace();
////        }
////
////    }
////
////    public void hideDialog() {
////        try {
////            if (progressDialog.isShowing()) {
////                progressDialog.dismiss();
////                myDialog=null;
////                progressDialog=null;
////            }
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////    }
////
////}
