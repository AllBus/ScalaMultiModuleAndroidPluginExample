package com.kos.scalamodule

import android.content.Context
class Driver {

  def getText(context: Context): String ={
    context.getString(ProxyScalaR.string.bravo)
  }

  def getLayout(context: Context):Int = {
    ProxyScalaR.layout.sample
  }


}
