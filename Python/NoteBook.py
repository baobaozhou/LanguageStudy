# #可变参数
# def report_card(name,*grades):
#     total=0
#     for grade in grades:
#         total+=grade
#     print(name,'total:',total)
# report_card('zhouhuiquan',93,91,99)
#
# #关键字参数
# def register(name,e_mail,**other):
#     other={'city','home','sex'}
#     print('name:',name,'e_mail:',e_mail,'other:',other)
# register('zhouhuiquan','1030626864@qq.com')
#
# #变量
# def fun():
#     global a
#     a = 20
#     return a+100
# fun() #用之前必须运行fun()函数
# print('a now:', a)

# #读写文件
# def io():
#     f=open('f:/Pycharm/python/1','r')
#     f1=open('f:/Pycharm/python/2','w')
#     # line=f.readlines()
#     for line in f.readlines():
#         char=line.split(' ')
#         f1.write(char[0]+'\n'+char[1])
#     f.close()
#     f1.close()
# io()

# #读文件夹里的文件
# def io_folder():
#     n=1
#     while n<=2:
#         firstname='f:/Pycharm/python/1/'+str(n)
#         secondname='f:/Pycharm/python/2'
#         f=open(firstname,'r')
#         f1 = open(secondname, 'a')
#         for line in f.readlines():
#             f1.write(line)
#         n=n+1
#         f.close()
#         f1.close()
# io_folder()

# #读取操作的区别
# def read_difference():
#     firstname='f:/Pycharm/python/1/1'
#     f=open(firstname,'r')
#     # char=f.read() #整个文本，str类型
#     # char = f.readline() #第一行，str类型,有长度属性,可以被list，以一长度为一个元素
#     char=f.readlines() #所有行，list类型，以第一行为一个元素,有长度
#     print(type(char))
#     print(char)
#     print(len(char))
#     print(char[0])
# read_difference()

# #输入操作
# a=input()
# print('我输入的是：',a)

# #列表操作
# a=['zhou',2,3,4,5]
# a.remove('zhou')
# del a[1]
# a.sort(reverse=True)
# print(a)

# #字典
# dict={'1':'直肠癌','2':'手术'}
# print(dict.get('1'))
# char=list(dict.items())
# print(char)
# for k,v in dict.items():
#     print(k,v)

# #导入模块
# import time as t
# from time import localtime
# print(localtime())

# #while中break/continue
# while True:
#     b= input('type somesthing:')
#     if b=='1':
#         continue
#     else:
#         pass
#     print('still in while')
# print ('finish run')

# #zip/lambda/map
# a=[1,2,3]
# b=[4,5,6]
# # print(list(zip(a,b)))
# for k,v in zip(a,b):
#     k=k/2
#     v=v*2
#     # print(k,v)
# def fun(x,y):
#     return(x+y)
# print(list(map(fun,[1,3],[2,4])))

# #thread
# import threading
# #multiprocessing
# import multiprocessing as mp
# def fun(x,y):
#     # print('PID is',threading.current_thread())
#     print(x,y)
#     # threading.current_thread() 当前运行的线程
#     # threading.active_count() 当前有几个进程
# #     # threading.enumerate() 线程的名字
# def main():
#     p=mp.Process(target=fun, args=(10,2))
#     p.start()
#     p.join()
# #     add_thread=threading.Thread(target=fun)
# #     add_thread.start()
# if __name__=='__main__':
#     main()
#
# import multiprocessing as mp
# def job(q):
#     res = 0
#     for i in range(10):
#         res+=i
#     q.put(res)    #queue
# def job1(q):
#     x=10
#     z=100
#     c=x*z
#     q.put(c)
#
# if __name__=='__main__':
#     q = mp.Queue()
#     p1 = mp.Process(target=job,args=(q,))
#     p2 = mp.Process(target=job1,args=(q,))
#     p1.start()
#     p2.start()
#     p1.join()
#     p2.join()
#     res1 = q.get()
#     res2 = q.get()
#     print(res1+res2)

# import pickle
# pkl文件是打包好的字典文件
# a_dict = {'da': 111, 2: [23,1,4], '23': {1:2,'d':'sad'}}
# # 打包
# file = open('pickle_example.pickle', 'wb')
# pickle.dump(a_dict, file)
# file.close()
#
#
# # 解包
# with open('pickle_example.pickle', 'rb') as file:
#     a_dict1 =pickle.load(file)
#
# print(a_dict1)

# import tkinter as tk
# window=tk.Tk()
# window.title('my window')
# window.geometry('400x400')
# var=tk.StringVar()
# def show():
#     var.set('17!up up')
# lable=tk.Label(window,textvariable=var,bg='green',font=('Arial',12),width=15,height=2)
# button=tk.Button(window,text='hit me',width=15,height=2,command=show)
# lable.pack()#放在位置
# button.pack()
# window.mainloop()


# # 冒泡排序
# def bubble_sort2(arr):
#     for j in range(len(arr) - 1, 0, -1):  # [n-1, n-2, ....2, 1]
#         for i in range(0, j):
#             if arr[i] > arr[i + 1]:
#                 arr[i], arr[i + 1] = arr[i + 1], arr[i]
#     return arr
# arr=[1,5,3,4]
# print(sorted(arr,reverse=True))

# 和谐序列
# # import collections
# def findLHS(self, nums):
#     """
#     :type nums: List[int]
#     :rtype: int
#     """
#     d = collections.Counter(nums)
#     for num in nums:
#         if num + 1 in d:
#             ans = max(d[num], d[nums])
#     return ans

# # 旋转阵列
# def rotate(nums, k):
#     """
#     :type nums: List[int]
#     :type k: int
#     :rtype: void Do not return anything, modify nums in-place instead.
#     """
#     nums_1 = nums[-k:]
#     nums_2 = nums[:-k]
#     nums_1.extend(nums_2)
#     return nums_1

# # 包含重复
# arr=[1,2,3,1]
# new_arr = sorted(arr)
# if arr==new_arr:
#     print('false')
# else:
#     print('true')


# # 单号 利用value找key
# 快速统计
# import collections
# def singleNumber(nums):
#     """
#     :type nums: List[int]
#     :rtype: int
#     """
#     d = collections.Counter(nums)
#     return list(d.keys())[list(d.values()).index(1)]
#
# # 集合求差集
# nums1 = [1,2,2,1]
# nums2 = [2,2]
# print(set(nums1).difference(set(nums2)))
# # 集合求并集
# print(set(nums1).union(set(nums2)))
# # 集合求交集
# print(set(nums1).intersection(set(nums2)))

# 打印list中的位置，或者内容
# for x,y in enumerate(list):
#     if y == '… …':
#         print(x+1)
#         list1.append(x)
# print(len(list1))

# 对json文件进行操作
# import json
# input_data = '../test.json'
# output_data = '../test5'
# with open(input_data, 'r', encoding='utf-8')as f:
#     for line in json.load(f):
#         print(line)
#         # with open(output_data, 'a', encoding='utf-8')as f1:
#         #     f1.write(line[0]+' '+str(5)+'\n')

"""
Tips
"""
# List转化为字符
# ''.join(list_obj)
# 删除list中的元素
# list.remove()
# 统计list中元素重复
# list.count(obj)
# 合并两个list L1.extend(L2)

# String object's property
# 首字母大写，其余全部小写
# str_obj.capitalize()
# 全转换成大写
# str_obj.upper()
# 全转换成小写
# str_obj.lower()
# 去除首尾制定字符
# str_obj.strip()
# 多符号切割
# re.split(r', |\?', string)

# 正则
# 匹配汉字
# re.findall('[\u4e00-\u9fff]+', line)
# 匹配制定符号里的内容{{}}
# re.findall('(?<=\\{{)[^\\}}]+', line)
# $ 表示结尾
# \\表示去掉特殊含义 r\ 也表示
# (?!...)之后的字符不匹配
# (?=...)之后的字符匹配
# (?<=...)之前的字符匹配
# (?<!...)之前的字符不匹配
# |或 ^匹配开头 \s匹配空白 \S匹配非空
# (.*?)非贪婪匹配
# [...]除之外的字符
# re.match 从头
# re.search 找到就行

# 去掉重复,顺序变化
# list2 = list(set(list1))
# list2.sort(key=list1.index)
# 表示到最后七个之前
# [:-7]
# 表示第一个之后
# [1:]

# 循环两个列表
# for m,n in zip(list1,list2) 是同时拿出
# continue 跳出当前循环
# break 跳出大循环
# step over 跳过当前循环或者判断
# step into 一步步
# step out 跳出

# Linux操作
# 查看容器
# docker image ls

# 查看当前有哪些容器正在运行
# docker ps

# 后台启动一个容器后，如果想进入到这个容器，可以使用attach命令
# docker attach container_name/container_id
# 挂载目录
# nvidia-docker run -it -v /home/tch01/zutnlp/:/zutnlp makalo:tf

# 使用ssh传输文件
# 从服务器下载东西
# scp servername@serverip:serverdirpath localdirpath
# scp -r liu608@192.168.1.104:/home/liu608/texar ./
# 上传到本地服务器
# scp localpath sername@serip:serpath
# scp translation.zh liu608@192.168.1.104:/home/liu608

# ssh tch01@192.168.1.250
# 308@yatailou

#移动文件
# mv dir dir
#打包压缩文件
# tar -cvzf
#解压
# tar -zxvf
