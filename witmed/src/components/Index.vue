<template>
  <div id="app">
    <h1>欢迎来到 KJ220401Q 的世界</h1>
    <ul>
      <li>
        <!--
          <router-link> 最终会被渲染为一个超链接 <a>，to 就相当于 href，
          对应的就是路由中的 path 属性值
        -->
        <router-link to="/chenyihao">查看陈义豪</router-link>
      </li>
      <li>
        <router-link to="/chenjiajun">查看陈家骏</router-link>
      </li>
      <li>
        <router-link to="/lixiang">查看李翔</router-link>
      </li>
    </ul>
    <div>
      <!--
        当点击路由得到相关组件后，该组件会显示在 <router-view/> 标签中
      -->
      <router-view/>
    </div>
  </div>
</template>

<script>
export default {
  name: "Index"
}
</script>

<style scoped>

</style>
