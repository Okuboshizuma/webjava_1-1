package jp.co.systena.tigerscave.shoppingcart.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.tigerscave.shoppingcart.application.model.ListForm;
import jp.co.systena.tigerscave.shoppingcart.application.model.ListService;

@Controller  // Viewあり。Viewを返却するアノテーション
public class ListController {

  @Autowired
  private ListService listService;

  @RequestMapping(value="/", method=RequestMethod.GET)
  public ModelAndView show(@ModelAttribute("ListView") ListForm form, ModelAndView mav) {

    form.setItemList(listService.getItemList());

    mav.setViewName("ListView");
    mav.addObject("itemList", form.getItemList());

    return mav;
  }

}
