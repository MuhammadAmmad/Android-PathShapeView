package shape.path.view.point.converter

import android.graphics.Matrix
import android.graphics.PointF

/**
 * Created by root on 1/9/18.
 */
class CoordinateConverter(var originScreenW: Float, var originScreenH: Float) : PointConverter() {

    private var screenScaleFactorX = 1f
    private var screenScaleFactorY = 1f

    override fun setScreenSize(screenWidth: Float, screenHeight: Float) {
        super.setScreenSize(screenWidth, screenHeight)
        screenScaleFactorX = screenWidth / originScreenW
        screenScaleFactorY = screenHeight / originScreenH
        matrix.setScale(screenScaleFactorX, screenScaleFactorY)
    }

    /*override fun convertPoint(originPoint: PointF): PointF {
        val x = originPoint.x * screenScaleFactorX
        val y = originPoint.y * screenScaleFactorY
        return PointF(x, y)
    }*/

    override fun getMatrix(): Matrix {
        return matrix
    }
}