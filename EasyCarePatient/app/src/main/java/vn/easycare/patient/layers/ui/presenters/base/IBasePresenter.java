package vn.easycare.patient.layers.ui.presenters.base;

import vn.easycare.patient.layers.ui.views.base.IBaseView;

/**
 * Created by phannguyen on 3/15/15.
 */
public interface IBasePresenter<T extends IBaseView> {
    void init(T view);
}
