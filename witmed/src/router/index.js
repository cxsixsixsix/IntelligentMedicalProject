import Vue from 'vue'
import Router from 'vue-router'
import Index from "@/components/Index";
// 引入 Chenyihao.vue 对应的组件
import Chenyihao from '@/components/Chenyihao'
import Chenjiajun from "@/components/Chenjiajun"
import Lixiang from "@/components/Lixiang"
import Anhong from "@/components/Anhong"
import Cuifen from "@/components/Cuifen"
import Wangyi from "@/components/Wangyi"

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Index',
      component: Index
    }, {
      // path 属性制定该组件的链接地址
      path: '/chenyihao',
      // name 属性指定该路由的名称
      name: 'Chenyihao',
      // component 属性指定当点击该链接时，所跳转的组件
      component: Chenyihao,
      // 通过 children 创建二级路由
      children: [
        // 设置二级路由的链接地址
        {
          // 对于二级路由前的链接地址不需要增加“/”
          // 否则无法加载对应的组件信息
          path: 'anhong/:name/:cellphone',
          name: 'Anhong',
          component: Anhong,
          beforeEnter: function (to, from) {
            console.log(to);
            console.log(from);
          }
        }, {
          path: 'cuifen',
          redirect: Anhong
        }, {
          path: 'wangyi',
          component: Wangyi
        }
      ]
    }, {
      path: '/chenjiajun',
      name: 'Chenjiajun',
      component: Chenjiajun
    }, {
      path: '/lixiang',
      name: 'Lixiang',
      component: Lixiang
    }
  ]
})
